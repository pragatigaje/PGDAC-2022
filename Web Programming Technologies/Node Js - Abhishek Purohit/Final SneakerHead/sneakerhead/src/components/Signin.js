import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
// import InputGroup from 'react-bootstrap/InputGroup';
import Row from 'react-bootstrap/Row';
import 'bootstrap/dist/css/bootstrap.min.css';
// import { FormControl } from 'react-bootstrap';
export function Signin() {
    const [validated, setValidated] = useState(false);

    const handleSubmit = (event) => {
        const form = event.currentTarget;
        if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
        }

        setValidated(true);
    };

    return (
        <Form noValidate validated={validated} onSubmit={handleSubmit} className="m-5">
            <Row className="mb-5">
            <Form.Group as={Col} md="3"  controlId="validationCustom04">
                    <Form.Label>Enter Email</Form.Label>
                    <Form.Control type="text" placeholder="Email Address" required pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,63}$" />
                    <Form.Control.Feedback type="invalid">
                        Please Enter Valid Email address
                    </Form.Control.Feedback>
                </Form.Group>
                <span> <br></br> </span>
                <Form.Group as={Col} md="3" controlId="validationCustom02">
                    <Form.Label>Password</Form.Label>
                    <Form.Control
                        required
                        type="password"
                        placeholder="Enter Password"
                        pattern="[0-9]{6}"
                    />
                    <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                    <Form.Control.Feedback type="invalid">
                        Please Enter Valid Password (Min 6 Digits)
                    </Form.Control.Feedback>
                </Form.Group>
                
               </Row>
               <Button type="submit">Submit form</Button>
        </Form>
    );
}