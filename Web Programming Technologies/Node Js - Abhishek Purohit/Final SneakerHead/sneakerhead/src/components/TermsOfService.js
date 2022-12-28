import { Alert, Col, Container, Row } from "react-bootstrap";

export function TermsOfService() {
  return (
    <>
      <Container className="mt-3 text-center">
        <Col>
          {" "}
          <Alert>
            <b>Terms Of Service</b>
          </Alert>
        </Col>{" "}
      </Container>
      <Container className="mt-3">
        <Row>
          <Col lg={6}>
            <b>Terms Of Service</b>{" "}
            <p>
              <b>[User Engagement]</b>
            </p>
            <p>
              The users are hereby advised to carefully read the following Terms
              before engaging on this app/website. By registering as a seller on
              this app/website (www.thrifter.in) it is deemed that you
              understand and accept these terms.
            </p>
            <p>
              <b>i.Description Of Service Offered</b>
            </p>
            <p className="ms-4">
              {" "}
              <ul>
                <li>
                  SneakerHead E–com Solutions Private Limited [hereinafter
                  referred to as 'The Company'] offers a platform viz
                  www.thrifter.in [hereinafter referred to as 'The Platform'] to
                  its users who comply with these terms to display, offer and
                  sell their products namely apparels, footwear and fashion
                  accessories [hereinafter referred to as ‘The Products’]
                  through its platform.
                </li>
                <li>
                  The Company through its platform does a two-tier job i.e
                  audience build-up for its registered users and facilitation of
                  the sale of their products by remitting the payment into the
                  user’s bank account after completion of the transaction. While
                  the signup and listing are not chargeable, the seller is
                  charged a user fee @ 5% at the time of remittance of the final
                  payment to the seller.
                </li>
              </ul>
            </p>{" "}
            <p>
              <b>ii.Access To The Service</b>
            </p>
            <p className="ms-4">
              {" "}
              <ul>
                <li>
                  The user by signing up to the platform agrees to these
                  specific terms and is deemed to operate within the framework
                  of these terms.
                </li>
                <li>
                  Once an order is received, the same will be communicated to
                  the seller on its registered email and mobile number. The
                  seller is required and expected to acknowledge the order and
                  dispatch the same within 24 hours and upon receiving the
                  shipping details from the Company. Any delay on part of the
                  seller must be communicated in advance to our core team. Any
                  absence of a response from the seller shall be considered as a
                  breach of the term.
                </li>
                <li>
                  The seller is free to approach the buyer outside the platform
                  for fulfilment, dispatch or sell other products. Also, the
                  buyer is free to approach the seller independently for buying
                  any of its products or even and the Company will have no
                  objection whatsoever.
                </li>
              </ul>
            </p>{" "}
            <p>
              <b>iii.User Fees And Schedule Of Charges</b>
            </p>
            <p className="ms-4">
              {" "}
              <ul>
                <li>
                  Every order that the user will get from the customer on the
                  platform shall be subject to a user fee @ 5% of the sale
                  amount [hereinafter referred to as ‘The user fee’]. Such a
                  user fee is chargeable by the company on every successful
                  order and payment.
                </li>
                <li>
                  The user fee is charged at a flat rate and is not subject to
                  the volume of orders. Such a fee is charged at the time of
                  disbursement of the payment to the user.
                </li>
              </ul>
            </p>{" "}
          </Col>
          <Col lg={6}>
            <p>
              <b>iv.Acceptance</b>
            </p>
            <p className="ms-4">
              {" "}
              <ul>
                <li>
                  The Platform and the Service are provided to you subject to
                  these Terms of Service (these ‘Terms’). Signing up by you to
                  this platform, it is assumed that you have read and understood
                  these terms clearly.
                </li>
                <li>
                  Any deviation by you from these terms shall give the right to
                  the company to take corrective action and suspend the user
                  from accessing the platform and in cases where the seller’s
                  interest is hampered, to hold the payment until the dispute
                  between the buyer and seller is settled.
                </li>
              </ul>
            </p>{" "}
            <p>
              <b>v.Disputes And Resolutions</b>
            </p>
            <p className="ms-4">
              {" "}
              <ul>
                <li>
                  In the event of any dispute that arise between the user and
                  the Company either with regard to the above terms or otherwise
                  shall first be attempted, in good faith, to be resolved
                  through negotiations between any director of the Company and
                  the user or (its representative). If the dispute cannot be
                  settled amicably within thirty (30) days, the party raising
                  the dispute/grievance may take legal recourse.
                </li>
                <li>
                  All disputes arising out of or in any way connected with these
                  terms shall be deemed to have arisen at the place of the
                  registered office of the Company and Courts in whose
                  jurisdiction the registered office is situated shall be, by
                  law, competent to decide the same.
                </li>
              </ul>
            </p>{" "}
            <p>
              <b>vi.Disclaimer Of Warranties</b>
            </p>
            <p className="ms-4">
              {" "}
              <ul>
                <li>
                  By agreeing to these terms you expressly acknowledge and agree
                  that use of the platform and the service is entirely at your
                  own risk and that the platform and the service are provided on
                  an "as is" or "as available" basis, without any warranties of
                  any kind. All express and implied warranties, including,
                  without limitation, the warranties of merchantability, fitness
                  for a particular purpose, and non-infringement of proprietary
                  rights are expressly disclaimed to the fullest extent
                  permitted by the laws of India.
                </li>
                <li>
                  The Company makes no warranties or representations about the
                  accuracy or completeness of the platform's content or the
                  content of any third-party websites linked to the platform and
                  assumes no liability or responsibility for any (i) errors,
                  mistakes, or inaccuracies of content, (ii) personal injury or
                  property damage, of any nature whatsoever, resulting from your
                  access to and use of the platform and service,(iii) any
                  unauthorized access to or use of our servers and/or any and
                  all personal information and/or financial information stored
                  therein, (iv) any interruption or cessation of transmission to
                  or from the platform.
                </li>
              </ul>
            </p>{" "}
          </Col>
        </Row>
      </Container>
    </>
  );
}
