import { Component } from "react";
import { Alert, Container } from "react-bootstrap";

export class Home extends Component{
    render(){
        return(
            <Container className="text-center mt-5">
                <Alert variant="primary">
                    Welcome {this.props.name}, to our application
                </Alert>
                <p>Have a great day</p>
            </Container>
        )
    }
}