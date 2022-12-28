import { Card, Col, Container, Row } from "react-bootstrap";

export function AirJordan() {
  return (
    <>
      <Container>
        <Row>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Jordan/J11.JPG" />
              <Card.Body>
                <Card.Title>Air Jordan</Card.Title>
                <Card.Text>
                  <p>Air Jordan 1 Mid SEs</p>
                  <p>Rs.19500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Jordan/J31.JPG" />
              <Card.Body>
                <Card.Title>Air Jordan</Card.Title>
                <Card.Text>
                  <p>Air Jordan 1 Midcard SEs</p>
                  <p>Rs.11800</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Jordan/J13.JPG" />
              <Card.Body>
                <Card.Title>Air Jordan</Card.Title>
                <Card.Text>
                  <p>Air Jordan 1 Mid SE craft</p>
                  <p>Rs.11870</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Jordan/J21.JPG" />
              <Card.Body>
                <Card.Title>Air Jordan</Card.Title>
                <Card.Text>
                  <p>Air Jordan Zoom CMFT</p>
                  <p>Rs.19500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col>
            <Card border="secondary">
              <Card.Img variant="top" src="/Jordan/J41.JPG" />
              <Card.Body>
                <Card.Title>Air Jordan</Card.Title>
                <Card.Text>
                  <p>Air Jordan 1 Retroo OG</p>
                  <p>Rs.18500</p>
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    </>
  );
}
