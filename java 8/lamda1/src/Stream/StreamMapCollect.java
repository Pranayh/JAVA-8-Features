package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


// Here, we are mapping user to userDto.
public class StreamMapCollect {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"Pranay","secrete","pranay@gmail.com"));
        userList.add(new User(2,"Vinay","secrete1","nay@gmail.com"));
        userList.add(new User(3,"Ajay","secrete2","anay@gmail.com"));
        userList.add(new User(4,"Tanay","secrete3","ranay@gmail.com"));

        // Using Traditional way:

        List<UserDto> userDtosList= new ArrayList<UserDto>();

        for (User user: userList){
            userDtosList.add(new UserDto(user.getId(),user.getUserName(),user.getEmail()));
        }

        for (UserDto userDto: userDtosList){
            System.out.println(userDto);
        }


        // Using Stream Map function:
        System.out.println();

        System.out.println("Using Stream");
        List<UserDto> userDtosList2= new ArrayList<UserDto>();
        userDtosList2 = userList.stream().map(new Function<User, UserDto>() {
            @Override
            public UserDto apply(User user) {
                return new UserDto(user.getId(),user.getUserName(),user.getEmail());
            }
        }).collect(Collectors.toList());

        for (UserDto userDto: userDtosList2){
            System.out.println(userDto);
        }


        // Using Stream API with Lambda Expression:
        System.out.println("Using Lambda");
        System.out.println();

        userList.stream().map((User user)->(new UserDto(user.getId(),user.getUserName(),user.getEmail())))
                .forEach(System.out::println);




    }
}


class UserDto{
    private int id;
    private String userName;
    private String email;

    public UserDto(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
