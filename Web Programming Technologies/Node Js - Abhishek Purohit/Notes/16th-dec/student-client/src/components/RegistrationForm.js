import { Component } from "react";
import { Alert, Button, Col, Container, Form, Row } from "react-bootstrap";

export class RegistrationForm extends Component {
    constructor() {
        super();
        this.state = {
            id: '',
            name: '',
            phone: '',
            marks: '',
            email: ''
        }
    }
    render() {
        return (
            <>
                <Container className="mt-4 text-center">
                    <Alert>Student registration form</Alert>
                </Container>
                <Container className="mt-4">
                    <Form>
                        <Row>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Id</Form.Label>
                                    <Form.Control type="text" placeholder="Enter id" />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Name</Form.Label>
                                    <Form.Control type="text" placeholder="Enter name" />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Phone</Form.Label>
                                    <Form.Control type="text" placeholder="Enter phone" />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Marks</Form.Label>
                                    <Form.Control type="text" placeholder="Enter marks" />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Email</Form.Label>
                                    <Form.Control type="email" placeholder="Enter email" />
                                </Form.Group>
                            </Col>
                            
                        </Row>
                        <Button type='submit' variant="success">Register Student</Button>
                    </Form>
                </Container>
            </>
        );
    }
}