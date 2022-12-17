import React, { Component } from 'react'
import { Alert,Container, Row } from 'react-bootstrap';
import { getTopHeadlines } from '../Service/NewsApiService';
import { Article } from './Article';


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
                            <Article article={item}></Article>
                        )
                    })
                }
            </Row>

        </Container>
        </>
    )
  }
}
