import { Card, Col } from "react-bootstrap";

export function Article(props) {
    return (
        <Col lg={6}>
            <Card>
                <Card.Img variant="top" src={props.article.urlToImage} />
                <Card.Body>
                    <Card.Title>{props.article.title}</Card.Title>
                    <Card.Text>
                        {props.article.description}
                    </Card.Text>
                </Card.Body>
            </Card>
        </Col>
    );
}