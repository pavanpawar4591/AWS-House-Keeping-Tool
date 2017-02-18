<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<!-- start: TEXT FIELDS PANEL -->
<div class="panel panel-white">
	<div class="panel-heading">
		<h4 class="panel-title">
			Create <span class="text-bold"> Account</span>
		</h4>
		<div class="panel-tools">
			<div class="dropdown">
				<a data-toggle="dropdown"
					class="btn btn-xs dropdown-toggle btn-transparent-grey"> <i
					class="fa fa-cog"></i>
				</a>
				<ul class="dropdown-menu dropdown-light pull-right" role="menu">
					<li><a class="panel-collapse collapses" href="#"><i
							class="fa fa-angle-up"></i> <span>Collapse</span> </a></li>
					<li><a class="panel-refresh" href="#"> <i
							class="fa fa-refresh"></i> <span>Refresh</span>
					</a></li>
					<li><a class="panel-config" href="#panel-config"
						data-toggle="modal"> <i class="fa fa-wrench"></i> <span>Configurations</span>
					</a></li>
					<li><a class="panel-expand" href="#"> <i
							class="fa fa-expand"></i> <span>Fullscreen</span>
					</a></li>
				</ul>
			</div>
			<a class="btn btn-xs btn-link panel-close" href="#"> <i
				class="fa fa-times"></i>
			</a>
		</div>
	</div>
	<div class="panel-body">
		<form role="form" class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-1">
					Account Name </label>
				<div class="col-sm-9">
					<input type="text" placeholder="Text Field" id="form-field-1"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-1">
					Account owner </label>
				<div class="col-sm-9">
					<input type="text" placeholder="Text Field" id="form-field-1"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-1">
					Account owner Email Id </label>
				<div class="col-sm-9">
					<input type="text" placeholder="Text Field" id="form-field-1"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-1">
					HSPS Id </label>
				<div class="col-sm-9">
					<input type="text" placeholder="Text Field" id="form-field-1"
						class="form-control">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-1">
					Account Expiration date: </label>
				<div class="col-sm-9">
					<input type="text" placeholder="Text Field" id="form-field-1"
						class="form-control">
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-2">
					Access Key </label>
				<div class="col-sm-9">
					<input type="password" placeholder="Password" id="form-field-2"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-2">
					Secret Key </label>
				<div class="col-sm-9">
					<input type="password" placeholder="Password" id="form-field-2"
						class="form-control">
				</div>
			</div>


			<div class="form-group">
				<label class="col-sm-2 control-label" for="form-field-1">
					Billing Type </label>
				<div class="col-sm-9">
					<select id="form-field-select-3" class="form-control search-select">
						<option value="">&nbsp;</option>
						<option value="AL">Internal</option>
						<option value="AK">client Paywable</option>
						<option value="AZ">owned by client</option>
					</select>
				</div>
			</div>


			<div class="form-group">
				<button type="button" class="btn btn-green">Save</button>
				<button type="button" class="btn btn-blue">Cancel</button>

				<div class="col-sm-9"></div>
			</div>



		</form>
	</div>
</div>
<!-- end: TEXT FIELDS PANEL -->
<%@ include file="../common/footer.jspf"%>