<html>
<#include "../common/header.ftl">
<body>
<div id="wrapper" class="toggled">
    <#--    边栏nav-->
    <#include "../common/nav.ftl">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h3>
                    商品类目列表页
                </h3>
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th>
                            类目编号
                        </th>
                        <th>
                            类目名字
                        </th>
                        <th>
                            类目编号
                        </th>
                        <th>
                            创建时间
                        </th>
                        <th>
                            更新时间
                        </th>
                    </tr>
                    </thead>
                    <tbody>

                    <#list categoryList as category>
                        <tr class="success">
                            <td>
                                ${category.categoryId}
                            </td>
                            <td>
                                ${category.categoryName}
                            </td>
                            <td>
                                ${category.categoryType}
                            </td>
                            <td>
                                ${category.createTime}
                            </td>
                            <td>
                                ${category.updateTime}
                            </td>
                        </tr>
                    </#list>


                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>