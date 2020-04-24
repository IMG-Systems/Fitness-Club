import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import './fa-signup.css';

class FitnessAppSignup extends Component {

  //:
  componentDidMount() {
    console.log("PROPS",this.props)
  }
  //#

  //: RENDER
  render() {
    return (
        <div className="tfa-signup">
        <Link to="/signup-flow/business-owner">I am a business owner</Link>
        <Link to="/signup-flow/personal-trainer">I am a certified personal trainer</Link>
        <Link to="/signup-flow/coach-athlete">I am a coach/athlete</Link>
        </div>
    )
  }
  //#
}

export default FitnessAppSignup;
