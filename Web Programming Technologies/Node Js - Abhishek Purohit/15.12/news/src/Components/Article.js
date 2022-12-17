import React from 'react'
import {Col,Card,Button } from 'react-bootstrap'

export function Article(props) {
  return (
    <Col lg={6}>
        <Card>
        <Card.Img variant="top" src={props.article.urlToImage} />
        <Card.Body>
            <Card.Title>{props.article.title}</Card.Title>
            <Card.Text>{props.article.description}</Card.Text>
            <Button variant="primary" href={props.article.url}>Read More</Button>
        </Card.Body>
    </Card>
    </Col>
  )
}
