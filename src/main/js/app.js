
'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {climbing: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/climbing'}).done(response => {
			this.setState({climbing: response.entity._embedded.climbing});
		});
	}

	render() {
		return (
			<ClimbingList climbing={this.state.climbing}/>
		)
	}
}

class ClimbingList extends React.Component{
	render() {
		var climbing = this.props.climbing.map(climbing =>
			<Climbing key={climbing._links.self.href} climbing={climbing}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Name</th>
						<th>Notes</th>
					</tr>
					{climbing}
				</tbody>
			</table>
		)
	}
}

class Climbing extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.climbing.name}</td>
				<td>{this.props.climbing.notes}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)