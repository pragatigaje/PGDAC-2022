const API_KEY='9fdcf4bba00441d5987f148c2ead0e12';
const BASE_URL='https://newsapi.org/v2';

export async function getTopHeadlines(){
    try {
        const response=await fetch(`${BASE_URL}/top-headlines?country=in&apiKey=${API_KEY}`)
        const data=await response.json();
        return data;
    } catch (error) {
        console.log(error);
    }
}
export async function getAllNews(topic){
    try {
        const response=await fetch(`${BASE_URL}/everything?q=${topic}&apiKey=${API_KEY}`)
        const data=await response.json();
        return data;
    } catch (error) {
        console.log(error);
    }
}