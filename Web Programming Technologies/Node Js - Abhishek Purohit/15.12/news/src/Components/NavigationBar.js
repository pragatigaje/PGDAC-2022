import { Component } from "react";
import { Container,Navbar, Nav} from "react-bootstrap";
import { LinkContainer } from "react-router-bootstrap";


export class NavigationBar extends Component{
    render(){
        return (
            <Navbar bg="dark" variant="dark" >
            <Container>
              <Navbar.Brand href="#home">NewsApp</Navbar.Brand>
              <Nav className="me-auto">
                <LinkContainer to={'/'}>
                    <Nav.Link>Home</Nav.Link>
                </LinkContainer>
                <LinkContainer to={'/top-headlines'}>
                    <Nav.Link>Top Headlines</Nav.Link>
                </LinkContainer>
                <LinkContainer to={'/all-news'}>
                    <Nav.Link>All News</Nav.Link>
                </LinkContainer>
              </Nav>
              <br></br>
            </Container>
          </Navbar> 
        )
    }
}