/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.renren.dto;

/**
 * 大盘查询表单
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.1.0 2018-01-25
 */
public class DgjjMarketDto {

	private String id;
	
	private String marketId;
	
	private String techName;
	
	private String driveNumber;
	
	private String driveCash;
	
	private String transferProgress;
	
	private String transferProgressText;
	
	private String techAppraise;
	
	private String userId;
	
	private String attentionId;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarketId() {
		return marketId;
	}

	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getDriveNumber() {
		return driveNumber;
	}

	public void setDriveNumber(String driveNumber) {
		this.driveNumber = driveNumber;
	}

	public String getDriveCash() {
		return driveCash;
	}

	public void setDriveCash(String driveCash) {
		this.driveCash = driveCash;
	}
	
	public String getTransferProgress() {
		return transferProgress;
	}

	public void setTransferProgress(String transferProgress) {
		this.transferProgress = transferProgress;
	}

	public String getTransferProgressText() {
		return transferProgressText;
	}

	public void setTransferProgressText(String transferProgressText) {
		this.transferProgressText = transferProgressText;
	}

	public String getTechAppraise() {
		return techAppraise;
	}

	public void setTechAppraise(String techAppraise) {
		this.techAppraise = techAppraise;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAttentionId() {
		return attentionId;
	}

	public void setAttentionId(String attentionId) {
		this.attentionId = attentionId;
	}
	
}
