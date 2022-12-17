import { Alert, Container } from "react-bootstrap";

export function Home(){
    return(
        <Container className="text-center mt-5">
            <Alert variant="primary">
                Welcome to news application
            </Alert>
            <p>
                Get all updates of your surrounding here!!
            </p>
        </Container>
    );
}