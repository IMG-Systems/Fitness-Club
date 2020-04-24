import React, { Component } from 'react';
import './fa-signup-flow.css';


const BusinessOwner = () => {
    return (
        <div>
        <h2>Drive Traffice to Your Buesiness</h2>
        <p>Get your business discovered by thousands of people looking for one on personalized training</p>
        </div>
    )
}
const CoachAthlete = () => {
    return (
        <div>
        <h2>Never Worry About Marketing</h2>
        <p>Our smart algorithms will be exposing your business to potential customers each day</p>
        </div>
    )
}
const PersonalTrainer = () => {
    return (
        <div>
        <h2>Get Paid For Your Services</h2>
        <p>Customers will get paid for your services through the app and the money will be deposited to your account.  See real time profit reports and know what you are getting paid.  Easy as that</p>
        </div>
    )
}

const SIGNUP_TYPES = {
    "business-owner": <BusinessOwner/>,
    "coach-athlete": <CoachAthlete/>,
    "personal-trainer": <PersonalTrainer/>,
}

class FitnessAppSignupFlow extends Component {

  //:
  componentDidMount() {
    console.log( this.props)
  }
  //#


  //: RENDER
  render() {
    
    const signupType = this.props.match.params.slug ? SIGNUP_TYPES[this.props.match.params.slug] : "FOOBAR"; 

    return (
      <div className="tfa-signup-flow">
       <a href="javascript:void(0)" className="tfa-goback" onClick={this.props.history.goBack}>&#60;</a>
       <span>Sign Up</span>
       {signupType}

        <div className="tfa-signup-flow-indicator-dots">
        <ul>
            <li>&nbsp;</li>
            <li>&nbsp;</li>
            <li>&nbsp;</li>
            <li>&nbsp;</li>
       </ul>
        </div>
       
      </div>
    )
  }
  //#
}

export default FitnessAppSignupFlow;
