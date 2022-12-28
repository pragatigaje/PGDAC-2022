import { LinkContainer } from 'react-router-bootstrap';
import { Image } from 'react-bootstrap';
import './Body.css';
   export function Body() {
      return (
        <div>
          <video id="HomeV" controls muted loop autoPlay>
            <source src={require('./Img/Thrifter.mp4')} type="video/mp4" ></source>
          </video>
          {/* <a href="/shop"><img id="HomeB" src={require("./Img/Banner.jpg")} alt="Banner" /></a> */}
          {/* <LinkContainer to={'/shop'}> <Nav.Link><img id="HomeB" src={require("./Img/Banner.jpg")} alt="Banner" /></Nav.Link></LinkContainer> */}
          <LinkContainer to={'/shop'}>
                    <Image id="HomeB" src={require("./Img/Banner.jpg")} alt="Link to Shop" responsive></Image>
          </LinkContainer>
          <div className="container">
            <div className="lists1 " id="b1">
              <div><img src={require("./Img/s1.jpg")} alt="Product" /></div>
              <div>
                <p>DUNK</p>
                <p>Nike Sb Dunk Low What The Paul</p>
                <p>Rs.57690</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s2.jpg")} alt="Product"/></div>
              <div>
                <p>DUNK</p>
                <p>Nike Sb Dunk Low Wasted Youth</p>
                <p>Rs.19900</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s3.jpg")} alt="Product"/></div>
              <div>
                <p>DUNK</p>
                <p>Nike Sb Dunk Low Supreme Star Black</p>
                <p>Rs.79750</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s4.jpg")} alt="Product"/></div>
              <div>
                <p>DUNK</p>
                <p>Nike Sb Dunk Low Supreme Blue</p>
                <p>Rs.62950</p>
              </div>
            </div>
            <div className="lists1" id="b4">
              <div><img src={require("./Img/s5.jpeg")} alt="Product"/></div>
              <div>
                <p>DUNK</p>
                <p>Nike sb Dunk low harvest moon</p>
                <p>Rs.16750</p>
              </div>
            </div>
          </div>
          <div className="container">
            <div className="lists1" id="b1">
              <div><img src={require("./Img/s6.jpg")} alt="Product"/></div>
              <div>
                <p>DUNK</p>
                <p>Nike Sb Low Dunk The Civilists</p>
                <p>Rs.84999</p>
              </div>
            </div>
            <div onclick="window.location.href='Airjordan.html';" className="lists1">
              <div><img src={require("./Img/s7.jpg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 1</p>
                <p>High Travis Scott Mocha (PADS)</p>
                <p>Rs.142750</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s8.jpg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 1</p>
                <p>High Travis Scott Mocha (VNDS)</p>
                <p>Rs.127000</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s9.jpg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 4</p>
                <p>Air Jordan 4 High Union Guava Ice</p>
                <p>Rs.79750</p>
              </div>
            </div>
            <div className="lists1" id="b4">
              <div><img src={require("./Img/s10.jpg")} alt="Product"/></div>
              <div>
                <p>DUNK</p>
                <p>Nike Sb DUNK Low Supreme Stars</p>
                <p>Rs.79750</p>
              </div>
            </div>
          </div>
          <div className="container">
            <div className="lists1" id="b1">
              <div><img src={require("./Img/ad1.jpg")} alt="Product"/></div>
              <div>
                <p>Adidas</p>
                <p>Adidas Yeezy Boost 700 Hi-Res Red</p>
                <p>Rs.28300</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s17.jpg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 1</p>
                <p>Air Jordan 1 Mid classic Dark Maroon </p>
                <p>Rs.32495</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s11.jpg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 1</p>
                <p>Air Jordan 1 Mid Dark Teal Green</p>
                <p>Rs.13600</p>
              </div>
            </div>
            <div className="lists1">
              <div><img src={require("./Img/s12.jpeg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 1</p>
                <p>Air Jordan 1 Low Supreme Bulls</p>
                <p>Rs.14125</p>
              </div>
            </div>
            <div className="lists1" id="b4">
              <div><img src={require("./Img/s16.jpg")} alt="Product"/></div>
              <div>
                <p>Air Jordan 1</p>
                <p>Air Jordan 1 Mid Reverse Bredd</p>
                <p>Rs.9400</p>
              </div>
            </div>
          </div>
        </div>
      );
    };
