import React, { Component } from 'react'
import { Alert,Col,Container, Row,Card,Button } from 'react-bootstrap';
import { getTopHeadlines } from '../Service/NewsApiService';


export default class TopHeadlines extends Component {
    constructor(){
        super();
        this.state={
            news:[]
        }
    }
    async componentDidMount(){
        const data = await getTopHeadlines();
        console.log(data.articles);
        this.setState({news:data.articles});
    }
  render() {
    return (
        <>
        <Container className="text-center mt-4">
            <Alert>Check out top Headlines</Alert>
        </Container>
        <Container className="mt-3">
            <Row>
                {
                    this.state.news.map((item)=>{
                        return(
                            <Col lg={6}>
                                <Card>
                                    <Card.Img variant="top" src={item.urlToImage} />
                                    <Card.Body>
                                        <Card.Title>{item.title}</Card.Title>
                                        <Card.Text>{item.description}</Card.Text>
                                        <Button variant="primary" href='{item.url}'>Read More</Button>
                                    </Card.Body>
                                </Card>
                            </Col>
                        )
                    })
                }
            </Row>

        </Container>
        </>
    )
  }
}
