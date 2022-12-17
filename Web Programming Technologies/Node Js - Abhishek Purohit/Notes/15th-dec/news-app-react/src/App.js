import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Home } from "./components/Home";
import { NavigationBar } from "./components/NavigationBar";
import { TopHeadlines } from "./components/TopHeadlines";

function App() {
  return (
    <>
      <BrowserRouter>
        <NavigationBar></NavigationBar>
        <Routes>
          <Route path="/" element={<Home></Home>}></Route>
          <Route path="/top-headlines" element={<TopHeadlines></TopHeadlines>}></Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
