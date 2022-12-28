import axios from 'axios';

const BASE_URL = 'http://localhost:9800/products';
const SHOP_URL =  'http://localhost:9800/shop';
export async function saveRequest(student){
    return axios.post(BASE_URL,student)
}

export async function getAllRequestFromServer(){
    return axios.get(BASE_URL);
}

export function deleteRequestFromServer(id){
    return axios.delete(`${BASE_URL}/${id}`);
}

export function getRequestByNamePattern(pattern){
    return axios.get(`${BASE_URL}/name/${pattern}`);
}
export function getAllProductsFromServer(){
    return axios.get(SHOP_URL);
}