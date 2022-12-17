import { BrowserRouter, Route, Routes } from "react-router-dom";
import { ContactUs } from "./components/ContactUs";
import { Home } from "./components/Home";
import { NavigationBar } from "./components/NavigationBar";
import { ScoreBoard } from "./components/ScoreBoard";
import { SignUpForm } from "./components/SignUpForm";

function App() {
  return (
    <div>
      <BrowserRouter>
        <NavigationBar></NavigationBar>
        <Routes>
          <Route path="/" element={<Home name='Vijay' age='23'></Home>}></Route>
          <Route path="/score-board" element={<ScoreBoard></ScoreBoard>}></Route>
          <Route path="/sign-up" element={<SignUpForm></SignUpForm>}></Route>
          <Route path="/contact" element={<ContactUs></ContactUs>}></Route>
        </Routes>
      </BrowserRouter>
      
    </div>
  );
}

export default App;
