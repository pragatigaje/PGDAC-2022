import { Component } from "react";
import { Alert, Container, Row } from "react-bootstrap";
import { getTopHeadlines } from "../services/NewsApiService";
import { Article } from "./Article";

export class TopHeadlines extends Component {
    constructor() {
        super();
        this.state = {
            news: []
        }
    }
    async componentDidMount() {
        const data = await getTopHeadlines();
        console.log(data.articles);
        this.setState({ news: data.articles });
    }
    render() {
        return (
            <>
                <Container className="mt-4 text-center">
                    <Alert>View top headlines</Alert>
                </Container>
                <Container className="mt-3">
                    <Row>
                        {
                            this.state.news.map((item) => {
                                return (
                                    <Article article={item}></Article>
                                )
                            })
                        }
                    </Row>
                </Container>
            </>
        );
    }
}