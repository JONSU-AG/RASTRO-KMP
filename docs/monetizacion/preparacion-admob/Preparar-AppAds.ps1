param([Parameter(Mandatory=$true)][string]$WebPublicDirectory)
$ErrorActionPreference = 'Stop'
$webRoot = (Resolve-Path -LiteralPath $WebPublicDirectory).Path
if (-not (Test-Path -LiteralPath (Join-Path $webRoot 'index.html') -PathType Leaf)) { throw 'Selecciona el directorio de la web compilada existente que contiene index.html.' }
$line = (Get-Content -LiteralPath (Join-Path $PSScriptRoot 'app-ads.txt') -Raw).Trim()
$target = Join-Path $webRoot 'app-ads.txt'
$existing = if (Test-Path -LiteralPath $target) { [IO.File]::ReadAllText($target) } else { '' }
if (($existing -split '\r?\n') -notcontains $line) {
    $merged = if ([string]::IsNullOrWhiteSpace($existing)) { $line + "`n" } else { $existing.TrimEnd() + "`n" + $line + "`n" }
    [IO.File]::WriteAllText($target, $merged, [Text.UTF8Encoding]::new($false))
}
Write-Output 'Archivo preparado. No se desplego ni se modificaron paginas, configuracion o cuentas.'

