import { Component } from "react";
import { Alert, Button, Col, Container, Form, Modal, Row } from "react-bootstrap";
import { saveRequest } from "../services/ProductRequestAPIservice";
export class ProductRequest extends Component {
    constructor() {
        super();
        this.state = {
            formData: {},
            modalOpeningStatus: false,
            defaultValues: { id: '', name: '' }
        }
    }
    openDialog = () => {
        this.setState({ modalOpeningStatus: true });
    }
    closeDialog = () => {
        this.setState({ modalOpeningStatus: false });
    }
    handleChange = (event) => {
        this.setState(
            {
                formData: {
                    ...this.state.formData,
                    [event.target.name]: event.target.value
                }
            }
        );
    }
    handleSubmit = async (event) => {
        event.preventDefault();
        const response = await saveRequest(this.state.formData);
        console.log(response.data);
        if (response.status === 200) {
            this.setState({ formData: { id: '', name:'', brandname:'', price:'', email:'',phone:'' } });
            this.openDialog();
        }

    }
    render() {
        return (
            <>
                <Container className="mt-4 text-center ">
                    <Alert>Product Request Form</Alert>
                </Container>
                <Container className="m-4">
                    <Form onSubmit={this.handleSubmit}>
                        <Row>
                        <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Customer ID</Form.Label>
                                    <Form.Control type="text"  value={this.state.formData.id} placeholder="Enter CID" name='id' required pattern="[0-9]{1,4}$" onChange={this.handleChange} />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Your Name</Form.Label>
                                    <Form.Control type="text" value={this.state.formData.name} placeholder="Enter name" name='name' required pattern="[a-z,A-Z ]{3,20}" onChange={this.handleChange} />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Brand Name</Form.Label>
                                    <Form.Control type="text" value={this.state.formData.brandname} placeholder="Enter name" name='brandname' required pattern="[a-z,A-Z]{3,20}" onChange={this.handleChange} />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Phone</Form.Label>
                                    <Form.Control type="text" value={this.state.formData.phone} placeholder="Enter phone" name='phone' required pattern="[7-9]{1}[0-9]{9}$" onChange={this.handleChange} />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Expected Average Price INR</Form.Label>
                                    <Form.Control type="text" value={this.state.formData.price} placeholder="Enter price" name='price'required pattern="[0-9]{3,9}$" onChange={this.handleChange} />
                                </Form.Group>
                            </Col>
                            <Col lg={6}>
                                <Form.Group className="mb-3">
                                    <Form.Label>Email</Form.Label>
                                    <Form.Control type="email" value={this.state.formData.email} placeholder="Enter email" name='email' required pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,63}$" onChange={this.handleChange} />
                                </Form.Group>
                            </Col>

                        </Row>
                        <Button type='submit' variant="success">Send Request !</Button>
                    </Form>
                </Container>
                <Modal show={this.state.modalOpeningStatus} onHide={this.closeDialog}>
                    <Modal.Header closeButton>
                        <Modal.Title>Success</Modal.Title>
                    </Modal.Header>
                    <Modal.Body>Product Request Sent !</Modal.Body>
                    <Modal.Footer>
                        <Button variant="primary" onClick={this.closeDialog}>
                            Close
                        </Button>
                    </Modal.Footer>
                </Modal>
            </>
        )
    }

}