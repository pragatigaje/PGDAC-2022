import { Component } from "react";
import { Alert, Container } from "react-bootstrap";

export class Home extends Component{
    render(){
        return (
            <Container className="text-center mt-5">
                <Alert variant="primary">
                    Welcome {this.props.name}, to our application
                </Alert>
                <p>You are {this.props.age} years old</p>
            </Container>
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