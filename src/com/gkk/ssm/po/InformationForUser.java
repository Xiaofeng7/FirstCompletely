package com.gkk.ssm.po;

import java.sql.Timestamp;
import java.util.Date;

public class InformationForUser {
    private Integer id;

    private String nickname;

    private Date birthday;

    private String email;

    private String tel;

    private String instruction;
    
    private String address;
    
    private Integer userid;
    
    private Timestamp registertime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Timestamp getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Timestamp registertime) {
		this.registertime = registertime;
	}

	@Override
	public String toString() {
		return "InformationForUser [id=" + id + ", nickname=" + nickname + ", birthday=" + birthday + ", email=" + email
				+ ", tel=" + tel + ", instruction=" + instruction + ", address=" + address + ", userid=" + userid
				+ ", registertime=" + registertime + "]";
	}
	
}