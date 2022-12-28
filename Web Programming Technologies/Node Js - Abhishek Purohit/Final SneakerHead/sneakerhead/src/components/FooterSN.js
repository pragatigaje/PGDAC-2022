import React from 'react';
import Nav from 'react-bootstrap/Nav';
import {
  MDBFooter,
  MDBContainer,
  MDBIcon,
  MDBInput,
  MDBCol,
  MDBRow,
  MDBBtn
} from 'mdb-react-ui-kit';
import { LinkContainer } from 'react-router-bootstrap';

export function FooterSN() {
  return (
    <MDBFooter className='text-center' color='white' bgColor='dark'>
      <MDBContainer className='p-4'>
        <section className='mb-4'>
          <p>
            India's Best Sneaker Buying Website !
          </p>
        </section>

        <section className=''>
          <MDBRow>
            <MDBCol lg='3' md='6' className='mb-4 mb-md-0'>
              <h5 className='text-uppercase'>INFORMATION</h5>

              <ul className='list-unstyled mb-0'>
                <li>
                <LinkContainer to={'/aboutus'}>
                            <Nav.Link>About us</Nav.Link>
                        </LinkContainer>
                </li>
                <li>
                <LinkContainer to={'/privacypolicy'}>
                            <Nav.Link>Privacy Policy</Nav.Link>
                        </LinkContainer>
                </li>
                <li>
                <LinkContainer to={'/termsandcondition'}>
                            <Nav.Link>Terms & Condition</Nav.Link>
                        </LinkContainer>
                </li>
                <li>
                <LinkContainer to={'/termsofservice'}>
                            <Nav.Link>Terms of Service</Nav.Link>
                        </LinkContainer>
                </li>
              </ul>
            </MDBCol>
            <MDBCol lg='6' md='6' className='mb-4 mb-md-0'>
              <h5 className='text-uppercase'>CUSTOMER SERVICE</h5>

              <ul className='list-unstyled mb-0'>
                <li>
                  <a href='#!' className='text-white'>
                    FAQ
                  </a>
                </li>
                <li>
                  <a href='#!' className='text-white'>
                    Brands
                  </a>
                </li>
                <li>
                <LinkContainer to={'/contactus'}>
                            <Nav.Link>Contact Us</Nav.Link>
                        </LinkContainer>
                </li>
                <li>
                  <a href='#!' className='text-white'>
                    My Account
                  </a>
                </li>
              </ul>
            </MDBCol>
            <MDBCol lg='3' md='6' className='mb-4 mb-md-0'>
              <div>
                <p>
                  Contact Information:-Call Us :- Tel : +91 9425760177
                  WhatsApp : +91 9425760177
                  Email : sneakerhead@wpt.com
                </p>
              </div>
            </MDBCol>
          </MDBRow>
        </section>
      </MDBContainer>

      <div className='text-center p-3' style={{ backgroundColor: 'rgba(0, 0, 0, 0.2)' }}>
        © 2022 Copyright:
        <a className='text-white' href='https://mdbootstrap.com/'>
          SneakerHead.com
        </a>
      </div>
    </MDBFooter>
  );
}