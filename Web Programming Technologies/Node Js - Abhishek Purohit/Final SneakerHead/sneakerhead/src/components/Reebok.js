import { Card, Col, Container, Row } from "react-bootstrap";

export function Reebok() {
  return (
    <>
      <Container>
        <Row>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Rebook/R1.JPG" />
              <Card.Body>
                <Card.Title>Reebok</Card.Title>
                <Card.Text>
                  <p>Reebok Rbk Classic Court Peak</p>
                  <p>Rs.9500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Rebook/R2.JPG" />
              <Card.Body>
                <Card.Title>Reebok</Card.Title>
                <Card.Text>
                  <p>Reebok Rbk Classic Leather</p>
                  <p>Rs.29500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Rebook/R3.JPG" />
              <Card.Body>
                <Card.Title>Reebok</Card.Title>
                <Card.Text>
                  <p>Reebok Rbk Class Turbo Style</p>
                  <p>Rs.17500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Rebook/R4.JPG" />
              <Card.Body>
                <Card.Title>Reebok</Card.Title>
                <Card.Text>
                  <p>Reebok Classic Furyline 95</p>
                  <p>Rs.13500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Rebook/R5.JPG" />
              <Card.Body>
                <Card.Title>Reebok</Card.Title>
                <Card.Text>
                  <p>Reebok Rbk Classic Heritance </p>
                  <p>Rs.18200</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    </>
  );
}
