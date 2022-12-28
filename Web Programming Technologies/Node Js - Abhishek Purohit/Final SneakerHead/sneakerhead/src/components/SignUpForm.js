import React, { useState } from 'react';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';
import Row from 'react-bootstrap/Row';
import 'bootstrap/dist/css/bootstrap.min.css';
export function SignUpForm() {
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
            <Row className="mb-3">
                <Form.Group as={Col} md="3" controlId="validationCustom01">
                    <Form.Label>First name</Form.Label>
                    <Form.Control
                        required
                        type="text"
                        placeholder="First name"
                        pattern="[a-z,A-Z]{3,20}"
                    />
                    <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                    <Form.Control.Feedback type="invalid">
                        Please Enter Valid Name
                    </Form.Control.Feedback>
                </Form.Group>
                <Form.Group as={Col} md="3" controlId="validationCustom02">
                    <Form.Label>Last name</Form.Label>
                    <Form.Control
                        required
                        type="text"
                        placeholder="Last name"
                        pattern="[a-z,A-Z]{3,20}"
                    />
                    <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                    <Form.Control.Feedback type="invalid">
                        Please Enter Valid Name
                    </Form.Control.Feedback>
                </Form.Group>
                <Form.Group as={Col} md="3" controlId="validationCustomUsername">
                    <Form.Label>Mobile Number</Form.Label>
                    <InputGroup hasValidation>
                        <InputGroup.Text id="inputGroupPrepend">+91</InputGroup.Text>
                        <Form.Control
                            type="text"
                            placeholder="Enter Mobile Number"
                            aria-describedby="inputGroupPrepend"
                            required
                            pattern="[7-9]{1}[0-9]{9}$"
                        />
                        <Form.Control.Feedback type="invalid">
                            Please Enter Valid Mobile Number
                        </Form.Control.Feedback>
                    </InputGroup>
                </Form.Group>
                <Form.Group as={Col} md="3" controlId="validationCustom04">
                    <Form.Label>Enter Email</Form.Label>
                    <Form.Control type="text" placeholder="Email Address" required pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,63}$" />
                    <Form.Control.Feedback type="invalid">
                        Please Enter Valid Email address
                    </Form.Control.Feedback>
                </Form.Group>   
            </Row>
            <Row className="mb-3">
                <Form.Group as={Col} md="3" controlId="validationCustom04">
                    <Form.Label>Select State</Form.Label>
                    <Form.Select aria-label="Default select example">
                        <option>Select State</option>
                        <option value="1">Andhra Pradesh</option>
                        <option value="2">Arunachal Pradesh</option>
                        <option value="3">Bihar</option>
                        <option value="4">Chhattisgarh</option>
                        <option value="5">Goa</option>
                        <option value="6">Gujrat</option>
                        <option value="7">Haryana</option>
                        <option value="8">Himachal Pradesh</option>
                        <option value="9">Jharkhand</option>
                        <option value="10">Karnataka</option>
                        <option value="11">Kerala</option>
                        <option value="12">Madhya Pradesh</option>
                        <option value="13">Maharashtra</option>
                        <option value="14">Manipur</option>
                        <option value="15">Meghalaya</option>
                        <option value="16">Mizoram</option>
                        <option value="17">Nagaland</option>
                        <option value="18">Odisha</option>
                        <option value="19">Punjab</option>
                        <option value="20">Rajasthan</option>
                        <option value="21">Sikkim</option>
                        <option value="22">Tamil Nadu</option>
                        <option value="23">Telangana</option>
                        <option value="24">Tripura</option>
                        <option value="25">Uttar Pradesh</option>
                        <option value="26">Uttarakhand</option>
                        <option value="27">West Bengal</option>
                    </Form.Select>
                    <Form.Control.Feedback type="invalid">
                        Please Select State
                    </Form.Control.Feedback>
                </Form.Group>
                <Form.Group as={Col} md="3" controlId="validationCustom03">
                    <Form.Label>City</Form.Label>
                    <Form.Control type="text" placeholder="City" required pattern="[A-Z,a-z]{3,15}" />
                    <Form.Control.Feedback type="invalid">
                        Please provide a valid city.
                    </Form.Control.Feedback>
                </Form.Group>


                <Form.Group as={Col} md="3" controlId="validationCustom05">
                    <Form.Label>Zip</Form.Label>
                    <Form.Control type="text" placeholder="Zip" required pattern="[0-9]{6}" />
                    <Form.Control.Feedback type="invalid">
                        Please provide a valid zip (6-Digit Number)
                    </Form.Control.Feedback>
                </Form.Group>
            </Row>
            <Form.Group className="mb-3">
                <Form.Check
                    required
                    label="Agree to terms and conditions"
                    feedback="You must agree before submitting."
                    feedbackType="invalid"
                />
            </Form.Group>
            <Button type="submit">Submit form</Button>
            {/* {AddLibrary(
                'https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js')} */}
        </Form>
    );
}

// render(<SignUpForm />);