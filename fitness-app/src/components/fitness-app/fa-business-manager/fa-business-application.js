import React, { Component } from 'react';
import './fa-business-manager.css';

class FitnessBusinessApplication extends Component {

  //:
  componentDidMount() {
    
  }
  //#

  //: RENDER
  render() {
    return (
        <div className="tfa-business-application">
            <span>Business Application Form</span>
            <form className="tfa-business-application-form">
                <input type="text" placeholder="Name of Business" />
                <input type="text" placeholder="First Name" />
                <input type="text" placeholder="Last Name" />
                <input className="tfa-margin-top" type="text" placeholder="Address" />
                <input type="text" placeholder="City" />
                <input type="text" placeholder="State" />
                <input type="text" placeholder="Zip Code" />
                <input className="tfa-margin-top" type="text" placeholder="TAX ID Number" />
                <input type="text" placeholder="Type of Business Entity" />
                <input type="text" placeholder="Date Business Opened" />
                <button>Submit Application</button>
            </form>
        </div>
    )
  }
  //#
}

export default FitnessBusinessApplication;
