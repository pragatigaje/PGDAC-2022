import { Alert, Container } from "react-bootstrap";

export function Home(){
    return (
        <Container className="text-center mt-5">
            <Alert variant="primary">
                Welcome to News application.
            </Alert>
            <p>In this app you can views top headlines, all news also.</p>
        </Container>
    );
}