import { Card, Col, Container, Row } from "react-bootstrap";

export function AboutUs() {
  return (
    <Container className="mt-5 mb-5 ">
      <Row>
        <Col>
          <Card style={{ width: "40rem" }}>
            <Card.Title className="mt-3 ms-4">About us</Card.Title>
            <hr></hr>
            <Card.Body>
              SneakerHead is an Indian company owned by PNS Industries. Welcome
              to SneakerHead, your number one source for all things hype. We're
              dedicated to providing you the very best of sneakers, with an
              emphasis on authenticity, pricing, and the best experience for
              getting your Ws. Founded in 2022, SneakerHead has come a long way
              from its beginnings in CDAC Mumbai. When we first started out, our
              passion for sneakers and eco-friendly products to fight fast
              fashion drove them to start their own business. We hope you enjoy
              our products as much as we enjoy offering them to you. If you have
              any questions or comments, please don't hesitate to contact us.
            </Card.Body>
          </Card>
        </Col>
      </Row>
    </Container>
  );
}
