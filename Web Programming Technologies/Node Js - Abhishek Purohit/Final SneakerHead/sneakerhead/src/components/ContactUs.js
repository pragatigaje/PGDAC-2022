import { Card, Container } from "react-bootstrap";

export function ContactUs() {
  return (
    <Container>
      <Card
        className="mt-5 mb-5 ms-4 me-3 text-white"
        style={{ width: "22rem" }}
        bg="dark"
      >
        <Card.Title className="mt-2 ms-2">Contact Us:</Card.Title>
        <hr></hr>
        <Card.Header>
          <p>Register Office Cdac Kharghar, Navi Mumbai</p>
          <p>
            Call us - Tel : +91 9425760177 <br></br>WhatsApp : +91 9425760177{" "}
          </p>
          <p>Email : sneakerhead@wpt.com</p>
          <p>
            Chat with us live Email us: care@sneakerhead.in Mon-Sat, <br></br>
            11:00 AM - 11:00 PM
          </p>
          <p>Email : sneakerhead@wpt.com</p>
        </Card.Header>
      </Card>
    </Container>
  );
}
