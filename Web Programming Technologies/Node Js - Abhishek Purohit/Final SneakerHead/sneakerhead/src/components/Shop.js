import { useEffect, useState } from "react";
import { Alert, Button, Container,Card,Col,Row } from "react-bootstrap";
import { deleteRequestFromServer, getAllProductsFromServer } from "../services/ProductRequestAPIservice";

export function Shop() {

    const [productsList, setProductList] = useState([]);

    async function getAllProducts() {
        const response = await getAllProductsFromServer();
        setProductList(response.data);
    }
    
    useEffect(() => {
        getAllProducts();
    }, []);

    return (
        <>
            <Container className="mt-4 text-center">
                <Alert className="dark">Shop your fav brands!!</Alert>
            </Container>
            <Container className="mt-4 mb-4 text-center">
        <Row>
          {productsList.map((product) => {
            return (
              <Col lg={3}>
                <Card>
                  <Card.Img variant="top" src={`../Shop${product.url}`} alt="shop"/>
                  <Card.Body>
                
                    <Card.Title>{product.brand}</Card.Title>
                    <Card.Title>{product.info}</Card.Title>
                    <Card.Text>Rs.{product.price}</Card.Text>
                    <Button variant="primary" href={'#'}>
                      Add to Cart
                    </Button>
                  </Card.Body>
                </Card>
              </Col>
            );
          })}
        </Row>
      </Container>
        </>
    );
}