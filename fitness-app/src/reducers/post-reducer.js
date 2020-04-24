import {
  GET_RESTAURANTS_BEGIN,
  GET_RESTAURANTS_SUCCESS,
  GET_RESTAURANTS_FAILURE
} from './post-actions';

const initialState = {
		restaurants: [],
  		loading: false,
 		error: null
};



const postReducer = (state = initialState, action) => {
	
  switch(action.type) {
    case GET_RESTAURANTS_BEGIN:
		return {
			restaurants: [],
      		loading: true,
      		error: null,
      		
		}
	case GET_RESTAURANTS_SUCCESS:
		return {
      		restaurants: action.payload.restaurants,
      		loading: false,
      		error: null
		}
	case GET_RESTAURANTS_FAILURE:
		return {
      		restaurants: [],
      		loading: false,
      		error: action.payload.error
		}
    default:
			return state;
  }
}
export default postReducer;