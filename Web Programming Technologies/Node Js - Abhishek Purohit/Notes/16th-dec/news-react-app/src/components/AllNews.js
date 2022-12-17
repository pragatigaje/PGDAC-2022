import { useEffect, useState } from "react";
import { Alert, Col, Container, Form, Row } from "react-bootstrap";
import { getAllNews } from "../services/NewsApiService";
import { Article } from "./Article";

export function AllNews() {
    const [news, setNews] = useState([]);
    const [topic, setTopic] = useState('');

    /* getNews() will be called in useEffect and handleSubmit
        i.e. on initial load and at the form submission time
        at the initial load indian politics has been passed into it
        and at the form submission time state value has been passed into it
    */
    async function getNews(topic) {
        const data = await getAllNews(topic);
        setNews(data.articles);
    }
    /*
     handleChange() will be called when user starts typing into 
     the input field and it will assign the field value into the state
    */
    const handleChange = (event) => {
        setTopic(event.target.value)
    }

    /*
        handleSubmit() will be called when user has submitted the form
        this function is calling getNews function and in getNews
        we are passing state value and state is containing value 
        of the topic which user has entered 
    */
    const handleSubmit = (event) => {
        event.preventDefault();
        getNews(topic);
    }

    /*
        useEffect() will be called after intial render/return of the ui
        in this, we are calling getNews function and in getNews
        we are passing hard coded value i.e. indian politics 
    */
    useEffect(() => {
        getNews('indian politics');
    }, []);
    return (
        <>
            <Container className="mt-4 text-center">
                <Alert>View All News</Alert>
            </Container>
            <Container className="mt-4 mb-4">
                <Row>
                    <Col lg={6}>
                        <Form onSubmit={handleSubmit}>
                            <Form.Group className="mb-3">
                                <Form.Label>Topic</Form.Label>
                                <Form.Control type="text" placeholder="Enter topic" name='topic' onChange={handleChange} />
                            </Form.Group>
                            <input type={'submit'} value='Fetch News' className="btn btn-success btn-sm"></input>
                        </Form>
                    </Col>
                </Row>

            </Container>
            <Container className="mt-3">
                <Row>
                    {
                        news.map((item) => {
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