import { Card, Col, Container, Row } from "react-bootstrap";

export function Adidas() {
  return (
    <>
      <Container>
        <Row>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Adidas/A11.JPG" />
              <Card.Body>
                <Card.Title>Adidas</Card.Title>
                <Card.Text>
                  <p>Supernova 2 Running shoes</p>
                  <p>Rs.9500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Adidas/A12.JPG" />
              <Card.Body>
                <Card.Title>Adidas</Card.Title>
                <Card.Text>
                  <p>Classic SEs NMD R1 shoes</p>
                  <p>Rs.19500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Adidas/A13.JPG" />
              <Card.Body>
                <Card.Title>Adidas</Card.Title>
                <Card.Text>
                  <p>Zx 8000 Parley shoes 909</p>
                  <p>Rs.13500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Adidas/A21.JPG" />
              <Card.Body>
                <Card.Title>Adidas</Card.Title>
                <Card.Text>
                  <p>A star Superstar shoes 25</p>
                  <p>Rs.11500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Adidas/A22.JPG" />
              <Card.Body>
                <Card.Title>Adidas</Card.Title>
                <Card.Text>
                  <p>Classic Ultraboost 22 shoes</p>
                  <p>Rs.2500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    </>
  );
}
