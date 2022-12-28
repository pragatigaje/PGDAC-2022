import { Container, Row, Col, Tab, Tabs, Card } from "react-bootstrap";
import { Adidas } from "./Adidas";
import { AirJordan } from "./AirJordan";
import { AllBrands } from "./AllBrands";
import { Puma } from "./Puma";
import { Reebok } from "./Reebok";

export function Brands() {
  // function ControlledTabsExample() {
  //   const [key, setKey] = useState("home");
  // }
  return (
    <Container >
      <Container className="text-center m-2" bg="dark">
        <Row>
          <Tabs
            defaultActiveKey="all"
            id="justify-tab-example"
            className="mb-3"
            justify
          >
            <Tab eventKey="all" title="All ">
              <AllBrands></AllBrands>
              {/* <Sonnet /> */}
            </Tab>
            <Tab eventKey="home" title="Air Jordan">
              <AirJordan></AirJordan>
              {/* <Sonnet /> */}
            </Tab>
            <Tab eventKey="profile" title="Adidas">
              <Adidas></Adidas>
              {/* <Sonnet /> */}
            </Tab>
            <Tab eventKey="longer-tab" title="Puma">
              <Puma></Puma>
              {/* <Sonnet /> */}
            </Tab>
            <Tab eventKey="contact" title="Reebok">
              <Reebok></Reebok>
              {/* <Sonnet /> */}
            </Tab>
          </Tabs>
        </Row>
      </Container>
      {/* <Container>
        <Row>
          <Col>1 of 3</Col>
          <Col>2 of 3 </Col>
          <Col>3 of 3</Col>
        </Row>
        <Row>
          <Col>1 of 3</Col>
          <Col>2 of 3 </Col>
          <Col>3 of 3</Col>
        </Row>
      </Container> */}
    </Container>
  );
}
