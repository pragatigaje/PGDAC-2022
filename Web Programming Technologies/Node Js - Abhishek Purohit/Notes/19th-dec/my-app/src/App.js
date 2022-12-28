import logo from './logo.svg';
import './App.css';
import { Welcome } from './Welcome';
import { Login } from './Login';
import { ScoreBoard } from './ScoreBoard';
import { ErrorBoundary } from './ErrorBoundary';

function App() {
  return (
      <>
        <h1>Welcome to our app</h1>
        <ScoreBoard></ScoreBoard>
        
        <h1>End of this app</h1>
      </>
    );
}

export default App;
