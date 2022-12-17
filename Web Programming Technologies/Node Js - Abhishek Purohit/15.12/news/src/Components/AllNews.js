import React, { useEffect, useState } from 'react'
import { Alert, Container, Row,Col,Form} from 'react-bootstrap';
import { getAllNews } from '../Service/NewsApiService';
import { Article } from './Article';

export function AllNews() {
    const [news, setNews] = useState([]);
    const [topic, setTopic]=useState('');

     /* getNews() will be called in useEffect and handleSubmit
        i.e. on initial load and at the form submission time
        at the initial load indian politics has been passed into it
        and at the form submission time state value has been passed into it
    */
    async function getNews(topic){
        const data = await getAllNews(topic);
        setNews(data.articles);
    }
    /*
     handleChange() will be called when user starts typing into 
     the input field and it will assign the field value into the state
    */
    const handleChange=(event)=>{
        setTopic(event.target.value)
    }
    /*
        handleSubmit() will be called when user has submitted the form
        this function is calling getNews function and in getNews
        we are passing state value and state is containing value 
        of the topic which user has entered 
    */
    const handleSubmit =(event)=>{
        event.preventDefault();
        getNews(topic);

    }
    /*
        useEffect() will be called after intial render/return of the ui
        in this, we are calling getNews function and in getNews
        we are passing hard coded value i.e. indian politics 
    */
    useEffect(()=>{
       getNews('politics');        
    },[])

  return (
    <>
    <Container className='mt text-center'>
        <Alert>View all news</Alert>
    </Container>
    <Container>
        <Row>
            <Col lg={6}>
        <Form onSubmit={handleSubmit}>
            <Form.Group className="mb-3">
                <Form.Label>Topic</Form.Label>
                <Form.Control type="Text" placeholder="Enter Topic" onChange={handleChange}/>
            </Form.Group>
            <input type={'submit'} value='Fetch' className='btn btn-success btn-sm'></input>
        </Form>
            </Col>
        </Row>
    </Container>
    <Container>
        <Row>
            {  
                news.map((item)=>{
                    return (
                        <Article article={item}></Article>
                    )
                })
            }
        </Row>
    </Container>
    </>
  )
}
