import { useEffect, useState } from "react";
import { Alert, Button, Container, Modal, Table } from "react-bootstrap";
import { deleteRequestFromServer, getAllRequestFromServer } from "../services/ProductRequestAPIservice";

export function RequestList() {

    const [studentsList, setStudentsList] = useState([]);
    const [selectedStudentId, setSelectedStudentId] = useState('');
    const [isModalOpened,setIsModalOpened] = useState(false);

    const openModal = ()=>{
        setIsModalOpened(true);
    }
    const closeModal = ()=>{
        setIsModalOpened(false);
    }
    async function getAllStudents() {
        const response = await getAllRequestFromServer();
        setStudentsList(response.data);
    }
    const deleteStudent = async()=>{
        const response=await deleteRequestFromServer(selectedStudentId);
        console.log(response.data);
        closeModal();
        getAllStudents();
    }

    useEffect(() => {
        getAllStudents();
    }, []);

    return (
        <>
            <Container className="mt-4 mb-4 text-center">
                <Alert>
                    List of all Request
                </Alert>
            </Container>
            <Container>
                <Table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Brand Name</th>
                            <th>Phone</th>
                            <th>Price</th>
                            <th>Email</th>
                            <th>Options</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            studentsList.map((student) => {
                                return (
                                    <tr>
                                        <td>{student.id}</td>
                                        <td>{student.name}</td>
                                        <td>{student.brandname}</td>
                                        <td>+91-{student.phone}</td>
                                        <td>{student.price}</td>
                                        <td>{student.email}</td>
                                        <td><Button variant="danger" className="btn-sm" onClick={() => {
                                            setSelectedStudentId(student.id);
                                            openModal();
                                        }}>Delete</Button></td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </Table>
            </Container>
            <Modal show={isModalOpened} onHide={closeModal}>
                <Modal.Header closeButton>
                    <Modal.Title>Confirmation</Modal.Title>
                </Modal.Header>
                <Modal.Body>Are you sure you want to delete request with Cid {selectedStudentId}?</Modal.Body>
                <Modal.Footer>
                    <Button variant="success" onClick={deleteStudent}>
                       Yes, Delete
                    </Button>
                    <Button variant="danger" onClick={closeModal}>
                       No
                    </Button>
                </Modal.Footer>
            </Modal>
        </>
    );
}