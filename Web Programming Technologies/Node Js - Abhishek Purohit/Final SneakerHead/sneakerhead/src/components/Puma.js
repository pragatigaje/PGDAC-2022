import { Card, Col, Container, Row } from "react-bootstrap";

export function Puma() {
  return (
    <>
      <Container>
        <Row>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Puma/P11.JPG" />
              <Card.Body>
                <Card.Title>Puma</Card.Title>
                <Card.Text>
                  <p>New mirage neon sneakers</p>
                  <p>Rs.7500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Puma/P12.JPG" />
              <Card.Body>
                <Card.Title>Puma</Card.Title>
                <Card.Text>
                  <p>New mirage neon sneakers</p>
                  <p>Rs.8500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Puma/p13.jpg" />
              <Card.Body>
                <Card.Title>Puma</Card.Title>
                <Card.Text>
                  <p>Blaze of glory sneakers</p>
                  <p>Rs.9500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Puma/P14.JPG" />
              <Card.Body>
                <Card.Title>Puma</Card.Title>
                <Card.Text>
                  <p>Rider Fv Ultra Sneakers</p>
                  <p>Rs.9500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Puma/p15.jpg" />
              <Card.Body>
                <Card.Title>Puma</Card.Title>
                <Card.Text>
                  <p>M Motorsport X array 11</p>
                  <p>Rs.39500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    </>
  );
}
