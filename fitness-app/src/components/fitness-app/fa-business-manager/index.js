import React, { Component } from 'react';
import './fa-business-manager.css';

class FitnessBusinessManager extends Component {

  //:
  componentDidMount() {
    
  }
  //#

  //: RENDER
  render() {
    return (
        <div className="tfa-business-manager">
            <ul>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>
            </ul>
            <h2>Welcome to The TRAINR Business Manager</h2>
            <div>
                <input type="checkbox" />
                <button>Submit Your Business Application</button>
            </div>
            <div>
                <input type="checkbox" />
                <button>Submit Your Background Check</button>
            </div>
            <div className="tfa-margin-top">
                <input type="checkbox" />
                <button>Connect Your Social Media Accounts</button>
            </div>
            <div>
                <input type="checkbox" />
                <button>Setup Your Business Profile</button>
            </div>
            <div>
                <input type="checkbox" />
                <button>Setup Your Direct Deposit</button>
            </div>
        </div>
    )
  }
  //#
}

export default FitnessBusinessManager;
