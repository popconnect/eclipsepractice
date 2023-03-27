
public class UserMagagerWithException {

	public boolean login (String id, String pass) {
		if(!id.equals("hong")) {
			throw new LoginFailException(LoginFailException.ErrorCode.INVALID_ID, id);
		} else if(!pass.equals("1234")) {
			throw new LoginFailException(LoginFailException.ErrorCode.INVALID_PASS, pass);
		}
		return true;
	}
	
		public static void main(String[] args) {
			UserMagagerWithException userManager = new UserMagagerWithException();
			try {
				boolean result = userManager.login("hong", "1234");
				System.out.printf("로그인 성공여부 : %b%n", result);
			} catch (LoginFailException e) {
				System.out.printf("예외처리: %s%n",e.getLocalizedMessage());
			}
		}
	}


