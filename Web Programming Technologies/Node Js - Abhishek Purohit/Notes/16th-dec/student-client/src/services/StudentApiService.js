const BASE_URL = 'http://localhost:9800/students';

import axios from 'axios';

export async function saveStudent(student){
    return axios.post(BASE_URL,student)
}

export async function getAllStudents(){
    return axios.get(BASE_URL);
}