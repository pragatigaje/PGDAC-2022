import { BrowserRouter, Routes,Route } from "react-router-dom";
import { Home } from "./Components/Home";
import { NavigationBar } from "./Components/NavigationBar";
import TopHeadlines from "./Components/TopHeadlines";

function App() {
  return (
    <BrowserRouter>
      <NavigationBar></NavigationBar>
      <Routes>
        <Route path="/" element={<Home></Home>}></Route>
        <Route path="/top-headlines" element={<TopHeadlines></TopHeadlines>}></Route>
      </Routes>
    </BrowserRouter>
  );
}



export default App;
