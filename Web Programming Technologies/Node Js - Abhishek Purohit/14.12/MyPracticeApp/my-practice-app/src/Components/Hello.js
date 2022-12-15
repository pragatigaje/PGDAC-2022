
import { Component } from "react";

export class Hello extends Component{
    render(){
        return(
            <div>
                <h1>Hello {this.props.name}</h1>
<p>From class Component</p>
            </div>
        )
    }
}


// export function Hello(props){
//     return(
//         <div>
//             <h3>Hello {props.name}!!</h3>
//             <p>From Functional Component</p>
//         </div>
//     )
// }