import React, { Component } from 'react';
import './fa-create-account.css';

class FitnessCreateAccount extends Component {

  //:
  componentDidMount() {
    
  }
  //#

  //: RENDER
  render() {
    return (
        <div className="tfa-create-account">
            <span>Create Account</span>
            <div className="tfa-logo">Logo</div>
            <h2>Contact Information</h2>
            <form>
                <input type="text" placeholder="First Name" />
                <input type="text" placeholder="Last Name" />
                <input type="email" placeholder="Email" />
                <button>Create Account</button>
            </form>
        </div>
    )
  }
  //#
}

export default FitnessCreateAccount;
