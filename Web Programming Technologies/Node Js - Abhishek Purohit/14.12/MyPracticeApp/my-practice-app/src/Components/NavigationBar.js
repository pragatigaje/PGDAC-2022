import { Component } from "react";
import { Container,Navbar, Nav} from "react-bootstrap";
import { LinkContainer } from "react-router-bootstrap";

export class NavigationBar extends Component{
    render(){
        return (
            <Navbar bg="dark" variant="dark" >
            <Container>
              <Navbar.Brand href="#home">SneakerHead</Navbar.Brand>
              <Nav className="me-auto">
                <LinkContainer to={'/'}>
                    <Nav.Link>Home</Nav.Link>
                </LinkContainer>
                <LinkContainer to={'/score-card'}>
                    <Nav.Link>ScoreCard</Nav.Link>
                </LinkContainer>
                <LinkContainer to={'/login'}>
                    <Nav.Link>Login</Nav.Link>
                </LinkContainer>
                <LinkContainer to={'/sign-up'}>
                    <Nav.Link>Sign up</Nav.Link>
                </LinkContainer>
              </Nav>
              <br></br>
            </Container>
          </Navbar> 
        )
    }
}