import Header from "./components/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Main from "./components/Main";
import ItemsAvailable from "./components/ItemsAvailable";
import SignUp from "./components/SignUp";
function App() {
  return (
    <div>
      <BrowserRouter>
        <div>
          <Switch>
            <Route exact path="/" component={SignUp}></Route>
            <Route path="/home" component={Main}></Route>
            {/* <Route path="/restaurants" component={ItemsAvailable} /> */}
          </Switch>
        </div>
      </BrowserRouter>
    </div>
  );
}

export default App;
