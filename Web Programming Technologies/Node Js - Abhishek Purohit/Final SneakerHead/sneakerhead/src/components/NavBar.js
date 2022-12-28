import { Figure, Image } from 'react-bootstrap';
import { useAuth0 } from "@auth0/auth0-react";
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import { LinkContainer } from 'react-router-bootstrap';
import logopic from "./Img/logo.jpg"
export function NavBar() {
    const { loginWithRedirect } = useAuth0();
    const { logout } = useAuth0();
    const { user, isAuthenticated, isLoading } = useAuth0();
    return (
        <Navbar sticky="top" bg="black" variant="dark" expand="lg">
            <Container>
                <LinkContainer to={'/'}>
                    <Image width={90} height={60} src={logopic} responsive></Image>
                </LinkContainer>
                <Navbar.Brand href="/">SneakerHead</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">

                        <LinkContainer to={'/'}>
                            <Nav.Link>Home</Nav.Link>
                        </LinkContainer>
                        <LinkContainer to={'/shop'}>
                            <Nav.Link>Shop</Nav.Link>
                        </LinkContainer>
                        <LinkContainer to={'/brands'}>
                            <Nav.Link>Brands</Nav.Link>
                        </LinkContainer>
                        <LinkContainer to={'/request-product'}>
                            <Nav.Link>Request Product</Nav.Link>
                        </LinkContainer>
                        <LinkContainer to={'/view-request'}>
                            <Nav.Link>All Product Requests</Nav.Link>
                        </LinkContainer>
                    </Nav>
                    <Nav>
                        <li>
                            {isAuthenticated && <p className='text-warning'> {user.name} </p>
                            }
                        </li>
                           { isAuthenticated ? (
                            <li>
                            <button onClick={() => logout({ returnTo: window.location.origin })}>
                                Log Out
                            </button>
                            </li> ):( 
                            <li>
                            <button onClick={() => loginWithRedirect()}>Log In</button>;
                        </li>)}
                        
    
                        {/* <LinkContainer to={'/sign-in'}>
                            <Nav.Link>Sign in</Nav.Link>
                        </LinkContainer> */}
                        {/* <LinkContainer to={'/sign-up'}>
                            <Nav.Link>Sign up</Nav.Link>
                        </LinkContainer> */}
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
}