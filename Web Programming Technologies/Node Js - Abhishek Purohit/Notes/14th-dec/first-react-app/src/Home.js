import { Component } from "react";

export class Home extends Component{
    render(){
        return (
            <div>
                <h1>Welcome {this.props.name}</h1>
                <p>You are {this.props.age} years old</p>
            </div>
        );
    }
}

// export function Home(props){
//     return (
//         <div>
//             <h1>Welcome {props.name},  to home </h1>
//             <p>You are {props.age} years old</p>
//         </div>
//     );
// }